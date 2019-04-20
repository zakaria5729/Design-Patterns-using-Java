package abstract_factory_pattern.abstract_factory;

/*
* Provide a level of indirection that abstracts the creation of families of related or dependent objects without directly specifying their concrete classes. The "factory" object has the responsibility for providing creation services for the entire platform family. Clients never create platform objects directly, they ask the factory to do that for them.

This mechanism makes exchanging product families easy because the specific class of the factory object appears only once in the application - where it is instantiated. The application can wholesale replace the entire family of products simply by instantiating a different concrete instance of the abstract factory.

Because the service provided by the factory object is so pervasive, it is routinely implemented as a Singleton.
* */

public class AbstractFactoryMain {

    public static void main(String[] args) {
        //Pc OS
        AbstractOsFactory abstractOsFactory = AbstractOsFactory.createAbstractOsFactory("computer");
        IFactoryOS iFactoryOS = abstractOsFactory.getIFactoryOS("linux");
        iFactoryOS.specification();

        iFactoryOS = abstractOsFactory.getIFactoryOS("mac");
        iFactoryOS.specification();

        iFactoryOS = abstractOsFactory.getIFactoryOS("windows");
        iFactoryOS.specification();

        iFactoryOS = abstractOsFactory.getIFactoryOS("chrome");
        iFactoryOS.specification();

        System.out.println();

        //Mobile OS
        abstractOsFactory = AbstractOsFactory.createAbstractOsFactory("mobile");
        iFactoryOS = abstractOsFactory.getIFactoryOS("android");
        iFactoryOS.specification();

        iFactoryOS = abstractOsFactory.getIFactoryOS("iOS");
        iFactoryOS.specification();

        iFactoryOS = abstractOsFactory.getIFactoryOS("windows phone");
        iFactoryOS.specification();

        iFactoryOS = abstractOsFactory.getIFactoryOS("blackberry");
        iFactoryOS.specification();
    }
}
