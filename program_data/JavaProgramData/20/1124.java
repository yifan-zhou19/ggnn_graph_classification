package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{



	String str = new String(new char[11]);
	String substr = new String(new char[4]);
	char max;
	int m;
	int n;
	int i;
	int j;
	int z;
	int t;
	int temp = 0;
	while (scanf("%s%s",str,substr) != EOF)
	{
		  m = str.length();
		  n = substr.length();
		  max = str.charAt(0);

		  for (i = 0;i < m;i++)
		  {
			  if (str.charAt(i + 1) > max)
			  {
				  max = str.charAt(i + 1);
				  temp = i + 1;
			  }
		  }
		  for (j = 0;j <= temp;j++)
		  {
			  System.out.printf("%c",str.charAt(j));
		  }
		  for (z = 0;z < n;z++)
		  {
			  System.out.printf("%c",substr.charAt(z));
		  }
		  for (t = temp + 1;t < m;t++)
		  {
			  System.out.printf("%c",str.charAt(t));
		  }
		  System.out.print("\n");
	}
	}


}
