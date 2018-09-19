package <missing>;

public class GlobalMembers
{
	public static String word = new String(new char[200]);
	public static int[] pp = new int[200];
	public static int len;
	public static void op()
	{
		 int t = 0;
		 int i;
		 for (i = 0;i <= len;i++)
		 {
		 pp[i] = 0;
		 }
		 for (i = 0;i < len;i++)
		 {
						   if (word.charAt(i) == '(')
						   {
						   t++;
						   }
						   if (word.charAt(i) == ')')
						   {
										   t--;
										   if (t < 0)
										   {
											   pp[i] = ykhao;
										   t++;
										   }
						   }
		 }
		 t = 0;
		 for (i = len - 1;i >= 0;i--)
		 {
						   if (word.charAt(i) == ')' && pp[i] != ykhao)
						   {
						   t++;
						   }
						   if (word.charAt(i) == '(')
						   {
										   t--;
										   if (t < 0)
										   {
											   pp[i] = zkhao;
										   t++;
										   }
						   }
		 }
	}
	public static void pr()
	{
		 int i;
		 System.out.printf("%s\n",word);
		 for (i = 0;i < len;i++)
		 {
							if (pp[i] == 0)
							{
							System.out.print(" ");
							}
							if (pp[i] == zkhao)
							{
							System.out.print("$");
							}
							if (pp[i] == ykhao)
							{
							System.out.print("?");
							}
		 }
	}
	/*int main()
	{
	    printf("1");
	    getch();
	    return 0;
	}*/
	public static int Main()
	{
		int n;
		int i;
		//freopen("1.txt","w",stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		word = new Scanner(System.in).nextLine();
		len = word.length();
		op();
		pr();
		for (i = 2;i <= n;i++)
		{
			word = new Scanner(System.in).nextLine();
		len = word.length();
		System.out.print("\n");
		op();
		pr();
		}
		//getch();
		return 0;
	}

}

