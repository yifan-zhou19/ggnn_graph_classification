package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	int i1;
	int i3;
	int i2;
	int i4;
	int len;
	int m;
	int[] a = new int[100000];
	String str = new String(new char[100000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i1 = 1;i1 <= t;i1++)
	{
	m = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str = tempVar2.charAt(0);
	}
	len = str.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,(Integer.SIZE / Byte.SIZE));
	for (i2 = 1;i2 <= len - 1;i2++)
	{
	for (i3 = 0;i3 <= i2 - 1;i3++)
	{
	if (str.charAt(i2) == str.charAt(i3))
	{
	a[i3] = a[i3] + 1;
	a[i2] = a[i2] + 1;
	break;
	}
	}
	}
	for (i4 = 0;i4 <= len - 1;i4++)
	{
	if (a[i4] == 0)
	{
	System.out.printf("%c\n",str.charAt(i4));
	m = 1;
	break;
	}
	}
	if (m == 0)
	{
	System.out.print("no\n");
	}
	}
	}
}

