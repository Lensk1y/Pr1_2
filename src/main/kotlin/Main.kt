fun main(args: Array<String>) {
    print("Input a: ");
    val a:String = readln();
    var b:String = "";
    var i:Int;
    var j:Int = 0;
    var s:Char = 's';
    var cnt:Int = 0;
    var g:Char;
    var bb:Boolean = true;
    for (i in a.indices)
    {
        s = a[i];
        j = i;
        while (j < a.length)
        {
            if (s == a[j]) cnt++;
            j++;
        }
        for (g in b)
        {
            bb = true;
            if (s == g) {bb = false; break;}
        }
        if (bb) {println(s + " = " + cnt.toString()); b += s;}
        bb = true;
        cnt = 0;
    }
}