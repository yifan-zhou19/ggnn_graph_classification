package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[257]);
	   String sub = new String(new char[257]);
	   String rep = new String(new char[257]);
	   int i = 0;
	   int j = 0;
	   int k = 0;
	   int a;
	   str = new Scanner(System.in).nextLine();
	   sub = new Scanner(System.in).nextLine();
	   rep = new Scanner(System.in).nextLine();
	   a = sub.length();
	   for (i = 0;str.charAt(i) != '\0';i++)
	   {
			if (str.charAt(i) == sub.charAt(j))
			{
			  j++;
			  if (j == a)
			  {
				k = i;
				break;
			  }
			}
			else
			{
				j = 0;
			}
	   }
	   for (i = 0;str.charAt(i) != '\0';i++)
	   {
		  if (i == k - a + 1)
		  {
			System.out.printf("%s",rep);
			i = k;
		  }
		  else
		  {
			  System.out.printf("%c",str.charAt(i));
		  }
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}
