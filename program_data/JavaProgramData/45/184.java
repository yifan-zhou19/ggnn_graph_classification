package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n1;
	int n2;
	int i;
	int j;
	int v;
	int k;
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	n1 = a.length();
	n2 = b.length();
	for (i = 0;i <= n2 - n1;i++)
	{
		k = i;
		v = 1;
		for (j = 0;j < n1;j++)
		{
			if (a.charAt(j) == b.charAt(k))
			{
				v = v * 1;
			}
		else
		{
			v = v * 0;
		}
		k++;
		}
		if (v == 1)
		{
			System.out.printf("%d",i);
			break;
		}
	}
	}
}

