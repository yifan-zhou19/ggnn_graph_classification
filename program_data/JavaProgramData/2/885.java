package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		short a;
	//		char s[27];
	//	}
	//	b[999];
		short[] q = new short[26];
		short[] w = new short[26];
		short p;
		short t;
		short m;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].s = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
				for (j = 0;b[i].s[j] != '\0';j++)
				{
				p = (int)b[i].s[j] - 65;
				q[p]++;
				w[p]++;
				}
		}

		for (i = 0;i < 25;i++)
		{
			for (j = 0;j < 25 - i;j++)
			{
				if (q[j] < q[j + 1])
				{
				t = q[j];
				q[j] = q[j + 1];
				q[j + 1] = t;
				}
			}
		}
			for (i = 0;i < 25;i++)
			{

				if (w[i] == q[0])
				{
					m = i;
				}
			}
				System.out.printf("%c\n",(char)(m + 65));
				System.out.printf("%d\n",w[m]);
					for (i = 0;i < n;i++)
					{
					   for (j = 0;b[i].s[j] != '\0';j++)
					   {
						   if (b[i].s[j] == m + 65)
						   {
							   System.out.printf("%d\n",b[i].a);
						   }
					   }
					}
						   return 0;
	}

}

