package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,*b;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
		int i;
		int j;
		int n;
		int min;
		int x;
		char cc;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			cc = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				*(a + j) = 0; //a--????
				*(b + j) = 0; //??????
			}
			while ((cc < 'a') || (cc>'z'))
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					cc = tempVar3.charAt(0);
				}
			}
			j = 1;
			while ((cc >= 'a') && (cc <= 'z'))
			{
				*(a + cc - 'a') += 1;
				if (*(a + cc - 'a') == 1)
				{
					*(b + cc - 'a') = j;
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					cc = tempVar4.charAt(0);
				}
				j++;
			}
			min = 100002;
			x = -1;
			for (j = 0;j < 26;j++)
			{
				if ((*(a + j) == 1) && (*(b + j) < min)) //????�j�?????????????
				{
					min = (b + j);
					x = j;
				}
			}
			if (x < 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",'a' + x);
			}
		}
	}


}

