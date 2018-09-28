package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int p;
	  int q = 0;
	  int flag = 0;
	  String a = new String(new char[100000]);
	  int[] b = new int[26];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {


		a = new Scanner(System.in).nextLine();

		k = 0;
		while (a.charAt(k) != '\0')
		{
		  k++;
		}
		for (j = 0;j < k;j++)
		{
		  for (p = 0;p < k;p++)
		  {
			if (a.charAt(p) == a.charAt(j))
			{
				q++;
			}
		  }

		  if (q == 1)
		  {
			System.out.printf("%c\n",a.charAt(j));
			flag = 1;
			break;
		  }
		 if (q >= 2)
		 {
			  q = 0;
		 }
		}

		if (flag == 0)
		{
		  System.out.print("no\n");
		}
		for (j = 0;j < k;j++)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, '\0');
		}
		flag = 0;
	k = 0;
	q = 0;

	  }

	}

}

