package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int word = 0;
		int count = 0;
		String str = new String(new char[1000]);
		int[] p = new int[50];
		int l;
		int n1;
		int n2;
		int[] lengh = new int[50];
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == ' ')
			{
			word = 0;
			}
			else
			{
				if (word == 0)
				{
				word = 1;
				p[j] = i;
				j++;
				count++;
				}
			}
		}
			for (i = j = 0;i < count;i++)
			{
				for (l = p[i];str.charAt(l) != ' ' && l < len;l++)
				{
					lengh[j]++;
				}
					j++;
			}
				int max = 0;
				int min = 100000;
				for (i = 0;i < count;i++)
				{
					if (lengh[i] > max)
					{
					   n1 = p[i];
					   max = lengh[i];
					}
						if (lengh[i] < min)
						{
							n2 = p[i];
							min = lengh[i];
						}
				}
				  for (i = n1;str.charAt(i) != ' ' && i < len;i++)
				  {
				  System.out.printf("%c",str.charAt(i));
				  }
				  System.out.print("\n");
				  for (i = n2;str.charAt(i) != ' ' && i < len;i++)
				  {
				  System.out.printf("%c",str.charAt(i));
				  }
				  System.out.print("\n");
				  return 0;

	}

}
