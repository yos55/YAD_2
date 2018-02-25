package Pages

import geb.Page

class CarsPage extends Page {

    static url = "vehicles/private-cars"

    static at = { $("div#desktop_feed_view_search_engine_title_container").text() == "                                   חיפוש בלוח רכב פרטי                              " }

//    static content = {
//        cartStatus { module CartStatusModule, $('#cart-status-header') }
//    }
}