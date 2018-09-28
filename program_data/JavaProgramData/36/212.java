package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] p = new int[26];
		int[] q = new int[26];
		String a = new String(new char[300]);
		String b = new String(new char[300]);
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
		for (i = 0;i < a.length();i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (a.charAt(i) == 97 + j)
				{
					p[j]++;
				}
			}
		}
		for (i = 0;i < b.length();i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (b.charAt(i) == 97 + j)
				{
					q[j]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (p[i] != q[i])
			{
				System.out.print("NO");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
		System.out.print("YES");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
	}


}

