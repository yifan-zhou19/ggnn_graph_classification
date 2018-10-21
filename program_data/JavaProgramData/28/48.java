package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[300];
		int count = 0;
		int i = 0;
		int j;
		char t;
		while (t = System.in.read(),t != '\n')
		{
			if (t == ' ')
			{
				if (count != 0)
				{
					i++;
					n[i] = count;
					count = 0;
				}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto next;
			}
			else
			{
				count++;
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	next:
	;
		}
		n[i + 1] = count;
		System.out.printf("%d",n[1]);
		for (j = 2;j <= i + 1;j++)
		{
			System.out.printf(",%d",n[j]);
		}
	}
}
