package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int i;
	int j;
	int l;
	int x;
	int n;
	n = 0;
	String d = new String(new char[2000]);
	char m;
	int[] e = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		d = tempVar.charAt(0);
	}
	l = d.length();
	for (i = 0;i < l;i++)
	{
	if (d.charAt(i) >= 'a' && d.charAt(i) <= 'z')
	{
	d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) - 'a'+'A');
	}
	}
	for (i = 0;i < 1000;i++)
	{
	e[i] = 0;
	}
	for (i = 0;i < l;i++)
	{
		n++;
	 if (d.charAt(i + 1) != d.charAt(i))
	 {
		 m = d.charAt(i);
	 System.out.printf("(%c,%d)",m,n);
	 n = 0;
	 }
	}

	System.in.read();
	System.in.read();
	}
}

