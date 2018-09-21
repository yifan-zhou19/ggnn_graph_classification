package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String str = new String(new char[10000]);
	  int[] a = new int[301];
	  int t;
	  int first = 0;
	  int second = 0;
	  int i;
	  int j;
	  int m;
	  int n;
	  str = new Scanner(System.in).nextLine();
	  m = str.length();
	  for (i = 0,n = 1;i <= m;i++)
	  {
	  if (str.charAt(i) == ',')
	  {
		  n++;
	  }
	  }
	  for (i = 1, j = 0;i <= n != 0 && j < m;i++)
	  {
		  a[i] = 0;
	   for (t = 1;t <= 4;t++)
	   {
	   if (str.charAt(j) != ',' && str.charAt(j) != '\0')
	   {
		   a[i] = a[i] * 10 + str.charAt(j++) - '0';
	   }
	   else
	   {
		   j++;
		   break;
	   }
	   }
	  }
	  for (i = 1;i < n;i++)
	  {
		  for (j = 1;j <= n - i;j++)
		  {
			  if (a[j] < a[j + 1])
			  {
			  t = a[j];
			  a[j] = a[j + 1];
			  a[j + 1] = t;
			  }
		  }
	  }
	  for (i = 1;i <= n;i++)
	  {
	  if (a[i] > first)
	  {
		  first = a[i];
	  }
	  else if (a[i] > second && a[i] < first)
	  {
		  second = a[i];
	  }
	  }
	  if (second == 0)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		  System.out.printf("%u",second);
	  }
	}






}
