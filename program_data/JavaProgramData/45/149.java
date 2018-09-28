package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[255]);
		String s2 = new String(new char[255]);
		int i;
		int j;
		int a;
		int b;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		a = s1.length();
		b = s2.length();
		for (i = 0;i <= (b - a);i++)
		{
			for (j = i,k = 0;j < i + a;j++)
			{
				if (s1.charAt(k) == s2.charAt(j))
				{
					k++;
				}
			}
			if (k == a)
			{
				System.out.printf("%d",i);
	break;
			}
		}

	}






}

