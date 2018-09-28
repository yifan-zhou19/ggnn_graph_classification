package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[10000]);
		int i;
		int l;
		int[] a = new int[400];
		int k = 1;
		char c;
		s = new Scanner(System.in).nextLine();
		l = 0;
		k = 0;
		for (i = 0;(c = s.charAt(i)) != '\0';i++)
		{
			if (c != ' ')
			{
				l++;
			}
			else
			{
				a[k] = l;
				k++;
				l = 0;
			}
		}


		if (k == 0)
		{
			System.out.printf("%d",l);
		}
		else if (k > 0)
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < k;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf(",%d",a[i]);
				}
			}
			System.out.printf(",%d",l);
		}
	}


}
