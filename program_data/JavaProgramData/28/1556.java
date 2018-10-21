package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[30000]);
		char[][] zj = new char[300][100];
		int i = 0;
		int k;
		int t = 0;
		int[] len = new int[300];
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
		   k = 0;
		   while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
		   {
			   zj[t][k] = s.charAt(i);
			   k++;
			   i++;
		   }
		   zj[t][k] = '\0';
		   while (s.charAt(i) == ' ')
		   {
			   i++;
		   }
		   t++;
		}
		zj[t][k + 1] = '\0';
		for (i = 0;i < t;i++)
		{
		  len[i] = String.valueOf(zj[i]).length();
		}
		System.out.printf("%d",len[0]);
		for (i = 1;i < t;i++)
		{
		  System.out.printf(",%d",len[i]);
		}
		return 0;
	}

}
