package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int[] b = new int[400];
		int c;
		int i;
		int k;
		int[] tag = new int[10000];
		a = new Scanner(System.in).nextLine();
		i = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == ' ')
			{
				tag[i] = 1;
			}
			i++;
		}
		tag[i] = 1;
		i = 0;
		c = -1;
		k = 0;
		while (a.charAt(i) != null)
		{
			if (tag[i] == 1 && tag[i + 1] == 0)
			{
				c = i;
			}
			if (tag[i] == 0 && tag[i + 1] == 1)
			{
				b[k] = i - c;
				k++;
			}
			i++;
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		System.out.print("\n");
	}
}
