package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//	 int num;
	//	 char s[26];
	//	}
	//	b[999];
		int n;
		int i;
		int j;
		int ss;
		int max = 0;
		int r;
		char x;
		for (ss = 0;ss < 26;ss++)
		{
		*(p + ss) = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].s = tempVar3;
			}
		 for (j = 0;b[i].s[j] != '\0';j++)
		 {
		  *(p + ((int)b[i].s[j] - 65)) += 1;
		 }
		}
		for (r = 0;r < 26;r++)
		{
			max = max > *(p + r)?max:*(p + r);
		}


		for (r = 0;r < 26;r++)
		{
			if (*(p + r) == max)
			{
				System.out.printf("%c",(65 + r));
			x = r;
			System.out.print("\n");
			System.out.printf("%d\n",max);
			}
		}
	   for (i = 0;i < n;i++)
	   {
		for (j = 0;b[i].s[j] != '\0';j++)
		{
		if ((int)b[i].s[j] - 65 == x)
		{
		System.out.printf("%d\n",b[i].num);
		}
		}
	   }
	}
}

