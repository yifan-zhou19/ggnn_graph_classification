package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[200]);
		int[] b = new int[200];
		int i;
		int j;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		for (k = 0;k < 200;k++)
		{
			if (a.charAt(k) == '\0')
			{
				break;
			}
		}
		i = 0;

		for (j = 0;i < k;j++)
		{
			for (;i < k;i++)
			{
				if (a.charAt(i) == ' ')
				{
					b[j] = i;
					i++;
					break;
				}
			}

		}
		b[j - 1] = k;
		b[-1] = -1;
		l = j - 2;
		for (;l >= -1;l--)
		{
				 for (k = b[l] + 1;k <= b[l + 1] - 1;k++)
				 {

						  System.out.printf("%c",a.charAt(k));


				 }

			 if (l != -1)
			 {
			 System.out.print(" ");
			 }
		}


	}


}
