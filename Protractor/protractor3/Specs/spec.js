describe('demo calculator tests', function(){

    it('addition test', function(){
    
    browser.get('http://juliemr.github.io/protractor-demo/');
    element(by.model('first')).sendKeys('8');
    
    element(by.model('second')).sendKeys('10');
    
    element(by.css('[ng-click="doAddition()"]')).click();
    
    let res = element(by.cssContainingText('.ng-binding', '18'));
    
    expect(res.getText()).toEqual('18');
    
    
    
    browser.sleep(2000)
    
    });
    
    });
    