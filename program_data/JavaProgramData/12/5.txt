package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] s = new int[16];
		int i = 1;
		int a;
		int j;
		int b;



//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
			if (s[i] != 0)
			{
				i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
			a = i;
			b = 0;
			for (i = a;i >= 1;i--)
			{
				for (j = 1;j < i;j++)
				{
					if (s[i] == 2 * s[j] || s[j] == 2 * s[i])
					{
						b++;
					}
				}

			}

		System.out.printf("%d",b);

	}

}

