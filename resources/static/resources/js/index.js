var app = (()=>{
    let init = ()=>{ 
        login_form();
    }
    let login_form = ()=>{
        let wrapper = document.querySelector('#wrapper');
    
        wrapper.innerHTML = '<form action="/action_page.php">'
        +'  First name:<br>'
        +'  <input type="text" name="firstname" value="Mickey">'
        +'  <br>'
        +'  Last name:<br>'
        +'  <input type="text" name="lastname" value="Mouse">'
        +'  <br><br>'
        +'  <input id="login_btn" type="button" value="Login">'
        +'  <input id="join_btn" type="button" value="Join">'
        +'</form> ';

        let join_btn = document.querySelector('#join_btn');
        
        join_btn.addEventListener('click', function(){
            join_form();
        });
}

    let join_form = ()=>{
    let wrapper = document.querySelector('#wrapper');
    
    wrapper.innerHTML = '<form action="/action_page.php">'
    +'  Id:<br>'
    +'  <input type="text" name="iD" value="0505">'
    +'  <br>'
    +'  Pass:<br>'
    +'  <input type="text" name="Pass" value="1234">'
    +'  <br><br>'
    +'  Name:<br>'
    +'  <input type="text" name="Name" value="singang">'
    +'  <br>'
    +'  Ssr:<br>'
    +'  <input type="text" name="Ssr" value="4567">'
    +'  <br>'
    +'  Phone:<br>'
    +'  <input type="text" name="Phone" value="010-0000-0000">'
    +'  <br>'
    +'  <input id="check_btn" type="button" value="Check">'
    +'  <input id="cancle_btn" type="button" value="Cancle">'
    +'</form> ';

    let check_btn = document.querySelector('#check_btn');
        
    check_btn.addEventListener('click', ()=>{
            login_form();
        });
    }
  return {init : init};
})();