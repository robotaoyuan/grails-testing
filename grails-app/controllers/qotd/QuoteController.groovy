package qotd

class QuoteController {

    def index() { 
	redirect(action: "home") 
    }
    
    def home() {
	 render "<h1>fuck you motherfucker</h1>"
    }
}
