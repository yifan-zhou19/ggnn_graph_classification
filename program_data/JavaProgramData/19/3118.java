package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int len1;
		int len2;
		int count = 0;
		int sum = 0;
		char[][] str = new char[100][100];
		while ((str[++n] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		  if (str[n][0] == '0')
		  {
		   break;
		  }
		}
		n--;
		//cout<<str[n-1]<<endl<<str[n]<<endl;
		for (i = 1;i < n - 1;i++)
		{
		  if (i != 1)
		  {
			  System.out.print(" ");
		  }
		  if (strcmp(str[i],str[n - 1]) == 0)
		  {
			System.out.print(str[n]);
		  }
		  else
		  {
			System.out.print(str[i]);
		  }
		}
		System.out.print("\n");
		return 0;
	}

}

