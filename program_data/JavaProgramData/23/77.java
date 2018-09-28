package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		j = 0;
		for (i = 0;;i++)
		{
			if (a.charAt(i) == ' ')
			{
				b[j] = i;
				j++;
			}
			if (a.charAt(i) == '\0')
			{
				b[j] = i;
				break;
			}
		}
		//for(i=0;i<=j;i++)
			//printf("%d\n",j);
		for (i = j;i > 0;i--)
		{
			for (k = b[i - 1] + 1;k < b[i];k++)
			{
				System.out.printf("%c",a.charAt(k));

			}
			System.out.print(" ");
		}
		for (i = 0;i < b[0];i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}
}
