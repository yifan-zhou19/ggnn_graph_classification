package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k = -1;
		String zjy = new String(new char[30000]);
			 zjy = new Scanner(System.in).nextLine();
		while (k == -1 || zjy.charAt(k) != '\0')
		{
				k++;
				for (i = 0;zjy.charAt(k) != ' ' && zjy.charAt(k) != '\0';k++)
				{
					i++;
				}
				if (i != 0)
				{
									if (zjy.charAt(k) == ' ')
									{
										System.out.printf("%d,",i);
									}
				 else
				 {
					 System.out.printf("%d\n",i);
				 }
				}
		}
	}
}
