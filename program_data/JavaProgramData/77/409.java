package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		char boy;
		int[] num = new int[100];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int N;

		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			s = tangible.StringFunctions.changeCharacter(s, 0, tempVar);
		}
		boy = s.charAt(0);
		num[0] = 0;
		for (i = 1;i <= 100;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar2);
			}
			if (s.charAt(i) == '\n')
			{
				N = i - 1;
				break;
			}
			if (s.charAt(i) != boy)
			{
				num[i] = -1 * i;
			}
			if (s.charAt(i) == boy)
			{
				num[i] = i;
			}
			N = i;
		}

		for (p = num + 1;p < num + N;p++)
		{
			if (p < 0)
			{
				q = p;
				while (*(q - 1) == 0)
				{
					q--;
				}
				System.out.printf("%d %d\n",*(q - 1),-1 * p);
				p = null;
				*(q - 1) = 0;
			}
		}
		System.out.printf("0 %d",N);
	}

}

