package <missing>;

public class GlobalMembers
{
	public static void find(String sen, String t, int j, int i)
	{
	   int k;
	   int n;
	   for (k = j,n = 1;k <= j + i - 1;k++,n++)
	   {
		   t[n] = sen[k];
	   }
	   t[n] = '\0';
	}
	public static void trans(String t, String tt)
	{
		 int k;
		 int n;
		 int len;
		 len = t.length();
		 for (k = 1,n = len - 1;k <= len - 1;k++,n--)
		 {
			 tt[n] = t[k];
		 }
		 tt[len] = '\0';
	}
	public static int Main()
	{
	   String sen = new String(new char[501]);
	   String t = new String(new char[500]);
	   String tt = new String(new char[500]);
	   int i = 2;
	   int j;
	   int len;
	   int p;
	   int s;
	   int len1;
	   sen = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   len = sen.length();

	   while (i <= len) //i??????,j??????
	   {
		   j = 0;
		   while (j <= len - i)
		   {
			   p = 1;
			  find(sen, t, j, i);


			  trans(t, tt);

			  for (s = 1;s <= i;s++)
			  {
				 if (t.charAt(s) != tt.charAt(s))
				 {
					 p = 0;
					 break;
				 }
			  }

			  if (p == 1)
			  {


				  for (s = 1;s <= i;s++)
				  {
					  if (s != i)
					  {
						  System.out.print(t.charAt(s));
					  }
					  else
					  {
						  System.out.print(t.charAt(s));
						  System.out.print("\n");
					  }
				  }
			  }

			j++;
		   }

		   i++;

	   }
	   return 0;









	}











}

