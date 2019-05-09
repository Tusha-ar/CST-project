    var text = "WE MAKE YOU FEEL SAFE";
    var i = 0;
    var speed = 80;
function type()
{
    if(i<text.length)
        {
            document.getElementById("write").innerHTML += text.charAt(i);
            i++;
            setTimeout(type, speed);
        }
}
