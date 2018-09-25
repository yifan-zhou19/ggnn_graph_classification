package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String word = new String(new char[40]);
	  int n;
	  int m;
	  int i;
	  int j;
	  int k;
	  int p;
	  int q;
	  int sum = 0;
	  int flag = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 0;i < n;i++)
	  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   word = tempVar2.charAt(0);
		   }
		   if (sum == 0)
		   {
			 System.out.printf("%s",word);

		   }

		   if (sum != 0 && sum <= 80 && (sum + word.length()) <= 80)
		   {
			 System.out.printf(" %s",word);

		   }

		   if (sum != 0 && sum <= 81 && (sum + word.length())>80)
		   {
			 System.out.printf("\n%s",word);
			 sum = 0;

		   }
			sum += word.length() + 1;
	  }

	}

}

