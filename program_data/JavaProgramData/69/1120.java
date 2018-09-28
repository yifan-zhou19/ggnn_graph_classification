package <missing>;

public class GlobalMembers
{
	public static String res = new String(new char[Max + 1]); // ?
	public static String a = new String(new char[Max]); // ????!
	public static String b = new String(new char[Max]);
	public static int len1;
	public static int len2;
	public static void Init(tangible.RefObject<String> a)
	{
	int i;
	for (i = 0; i < Max; i++)
	{
	   a.argValue.charAt(i) = '0';
	}
	return;
	}

	public static void Long_Add(tangible.RefObject<String> res, tangible.RefObject<String> newone) // res????????????????.
	{
	int i;
	int j;
	int len;
	int tempsum;
	int carry = 0; // ??
	len = newone.argValue.length();
	for (i = Max - 1,j = len - 1; i >= 0,j >= 0; i--,j--)
	{
	   tempsum = res.argValue.charAt(i) - '0' + newone.argValue.charAt(j) - '0' + carry;
	   res.argValue.charAt(i) = tempsum % 10 + '0';
	   carry = tempsum / 10;
	}
	while (carry > 0) // ------??????????!
	{
	   tempsum = res.argValue.charAt(i) - '0' + carry;
	   res.argValue.charAt(i) = tempsum % 10 + '0';
	   carry = tempsum / 10;
	   i--;
	}
	//------------------- ??????????
	for (i = 0;i < Max;i++)
	{
	   if (res.argValue.charAt(i) != '0')
	   {
		break;
	   }
	}
	if (i == Max)
	{
	System.out.print("0");
	}
	else
	{
	int n = i;
	for (n;n < Max;n++)
	{
	   System.out.print(res.argValue.charAt(n));
	}
	}
	//--------------------------????????????    !

	return;
	}
	public static void Input(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
	int i;
	int len;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a.argValue = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b.argValue = tempVar2.charAt(0);
	}
	len1 = a.argValue.length();
	len2 = b.argValue.length();
tangible.RefObject<String> tempRef_res = new tangible.RefObject<String>(res);
	Init(tempRef_res);
	res = tempRef_res.argValue;
	len = a.argValue.length();
	for (i = len - 1; i >= 0; i--)
	{
	   res = tangible.StringFunctions.changeCharacter(res, Max + i - len, a.argValue.charAt(i));
	}
	}
	public static int Main()
	{
tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	Input(tempRef_a, tempRef_b);
	b = tempRef_b.argValue;
	a = tempRef_a.argValue;
tangible.RefObject<String> tempRef_res = new tangible.RefObject<String>(res);
tangible.RefObject<String> tempRef_b2 = new tangible.RefObject<String>(b);
	Long_Add(tempRef_res, tempRef_b2);
	b = tempRef_b2.argValue;
	res = tempRef_res.argValue;
	return 0;
	}

}

