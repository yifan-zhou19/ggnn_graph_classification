package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int j;
	  int m;
	  int count;
	  int s = 0;
	  char i;
	  String a = new String(new char[50]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  m = a.length();
	  for (i = 'A';i <= 'Z';i++)
	  {
		  count = 0;
		  for (j = 0;j < m;j++)
		  {
			  if (a.charAt(j) == i)
			  {
				  count++;
			  }
		  }
		  if (count != 0)
		  {
			  System.out.printf("%c=%d\n",i,count);
		  }
	  }
	  for (i = 'a';i <= 'z';i++)
	  {
		  count = 0;
		  for (j = 0;j < m;j++)
		  {
			  if (a.charAt(j) == i)
			  {
				  count++;
			  }
		  }
		  if (count != 0)
		  {
			  System.out.printf("%c=%d\n",i,count);
		  }
	  }
	  for (i = 0;i < m;i++)
	  {
		  if (((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z')) || ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z')))
		  {
			  s++;
		  }
	  }
	  if (s == 0)
	  {
		  System.out.print("No\n");
	  }
	}
}

