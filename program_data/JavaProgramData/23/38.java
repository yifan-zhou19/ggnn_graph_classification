package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int sum = 0;
		int[] p1 = new int[100];
		int[] p2 = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *str=(char *)malloc(101 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char str = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		String[] p = new String[100];
		for (i = 0;i < 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
		}
		p1[0] = 0;
		for (i = 0; * (str + i) != '\0';i++)
		{
			if (*(str + i) == ' ')
			{
				p2[sum] = i - 1;
			sum++;
			}
			else if (*(str + i - 1) == ' ' && *(str + i) != ' ' && *(str + i) != '\0')
			{
				p1[sum] = i;
			}
		}
		p2[sum] = i - 1;
		sum++;
		for (i = 0;i < sum;i++)
		{
			for (j = p1[i];j <= p2[i];j++)
			{
				p[i][(j - p1[i])] = *(str + j);
			}
		}
		for (i = 0;i < sum;i++)
		{
			p[i][(p2[i] - p1[i] + 1)] = '\0';
		}
		for (i = sum - 1;i > 0;i--)
		{
			System.out.printf("%s",p[i]);
		System.out.print(" ");
		}
		System.out.println(p[0]);
	}
}
