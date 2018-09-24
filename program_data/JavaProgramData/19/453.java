package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int k;
	int n;
	String p = new String(new char[100]);
	String p1;
	String p2;
	String a;
	String string = new String(new char[100]);
	char[][] str = new char[100][100];
	String str1 = new String(new char[100]);
	String str2 = new String(new char[100]);
	n = 0;
	k = 1;
	p = str;
	p1 = str1;
	p2 = str2;
	a = String;
	String = new Scanner(System.in).nextLine();
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();

	for (i = 0; * (a.Substring(i)) != '\0';i++)
	{
	  if (*(a.Substring(i)) == ' ')
	  {
		  k++;
	  }
	}

	for (i = 0; * (a.Substring(n)) != '\0';i++)
	{
		for (j = 0; * (a.Substring(n)) != ' ' && *(a.Substring(n)) != '\0';j++)
		{
			  *(*(p.Substring(i)) + j) = *(a.Substring(n));
	n++;
		}
	  *(*(p.Substring(i)) + j) = '\0';
	  n = n + 1;
	}
	n = n - 1;

	for (i = 0;i < n;i++)
	{
	  if (strcmp(*(p.Substring(i)),p1) == 0)
	  {
	  *(p.Substring(i)) = p2;
	  }
	}

	for (i = 0;i < k - 1;i++)
	{
		System.out.printf("%s",*(p.Substring(i)));
	System.out.print(" ");
	}
	System.out.printf("%s",*(p.Substring(k) - 1));


	}

}
