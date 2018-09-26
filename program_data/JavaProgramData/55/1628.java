package <missing>;

public class GlobalMembers
{
	public static int cifang(int u,int g)
	{
	 int l = 1;
	 for (int i = 1;i <= g;i++)
	 {
	  l = l * u;
	 }
	 return l;
	}

	public static int Main()
	{
	 int n;
	 int m;
	 int sum = 0;
	 String a = new String(new char[1000]);
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	 int s = a.length();
	 for (int i = 0;i <= s - 1;i++)
	 {
	  if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
	  {
	   int t = a.charAt(i) - '0';
	   sum = sum + t * cifang(n, s - 1 - i);
	  }
	  else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
	  {
	   int t = a.charAt(i) - 'A' + 10;
	   sum = sum + t * cifang(n, s - 1 - i);
	  }
	  else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
	  {
	   int t = a.charAt(i) - 'a' + 10;
	   sum = sum + t * cifang(n, s - 1 - i);
	  }
	 }
	 int[] b = new int[1000];
	 int j;

	 for (int d = 0;d <= 999;d++)
	 {
	  b[d] = sum % m;
	  sum = (sum - b[d]) / m;
	  if (sum < m)
	  {
	   if (sum > 0)
	   {
		if (sum > 10)
		{

		 System.out.print(c[sum - 10]);
		}
		else
		{
		 System.out.print(sum);
		}

		for (int f = d;f >= 0;f--)
		{
		 if (b[f] >= 10)
		 {
		  System.out.print(c[b[f] - 10]);
		 }
		 else
		 {
		  System.out.print(b[f]);
		 }
		}
	   break;
	   }
	   else
	   {
		for (int f = d;f >= 0;f--)
		{
		 if (b[f] >= 10)
		 {
		  System.out.print(c[b[f] - 10]);
		 }
		 else
		 {
		  System.out.print(b[f]);
		 }
		}
		break;
	   }
	  }
	 }


	 return 0;
	}
}

