import Pages.AnimalsPage
import Pages.CarsPage
import Pages.RealEstatePage
import Pages.Yad2Page

class TabsBuilder extends BuilderSupport {


    @Override
    protected Object createNode(Object name, Object URL) {
        switch(name) {
            case 'cars': return createCarsPage()
            case 'realEstate':return createRealEstatePage(URL)
            case 'yad2': return createYad2Page(URL)
            case 'animals': return createAnimalsPage(URL)
            default: throw new IllegalArgumentException("Invalid keyword $name")
        }
    }


    protected CarsPage createCarsPage() {
        return new CarsPage()
    }


    protected RealEstatePage createRealEstatePage(String URL) {
        return new RealEstatePage(URL)
    }


    protected Yad2Page createYad2Page(String URL) {
        return new Yad2Page(URL)
    }
    protected AnimalsPage createAnimalsPage(String URL) {
        return AnimalsPage(URL)
    }


    @Override
    protected void setParent(Object name, Object URL) {

    }

    @Override
    protected Object createNode(Object o) {
        return null
    }


    @Override
    protected Object createNode(Object o, Map map) {
        return null
    }

    @Override
    protected Object createNode(Object o, Map map, Object o1) {
        return null
    }
}
