package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char c;
		int[] js1 = new int[150];
		int[] js2 = new int[150];
		int b = 0;
		int d;
		int e;
		int i;
		int j;
		int k;
		int l1;
		int l2;
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
		l1 = s1.length();
		l2 = s2.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				for (j = 65;j < 123;j++)
				{
					if (s1.charAt(i) == j)
					{
						js1[j]++;
					}
				}
			}

			for (i = 0;i < l1;i++)
			{
				for (j = 65;j < 123;j++)
				{
					if (s2.charAt(i) == j)
					{
						js2[j]++;
					}
				}
			}
			for (i = 65;i < 123;i++)
			{
				if (js1[i] != js2[i])
				{
				b = 1;
				System.out.print("NO");
				break;
				}
			}
				if (b == 0)
				{
					System.out.print("YES");
				}








		}



	}
}

