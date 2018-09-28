package <missing>;

public class GlobalMembers
{
	public static int is_legal(String name, int length)
	{
		//printf("First char:%d\n", first_lg(name[0]));
		//printf("General:%d\n", illegal_sym(name, length));
		if (first_lg(name[0]) == 0)
		{
			return 0;
		}
		if (illegal_sym(name, length) == 0)
		{
			return 0;
		}
		return 1;
	}
	public static int first_lg(char trig)
	{
		int is1;
		int is2;
		int is3;
		char ch;

		ch = (Character.toUpperCase(trig));

		is1 = (ch > 'Z');
		is2 = (ch < 'A');

		if (trig == '_')
		{
			return 1;
		}
		if (is1 + is2 != 0)
		{
			return 0;
		}
		return 1;
	}
	public static int illegal_sym(String name, int length)
	{
		int i;
		char ch;
		int is_al;
		int is_num;
		int is_dash;
		int is;
		for (i = 0;i <= length - 1;i++)
		{
			  ch = Character.toUpperCase(name[i]);
			  is_al = (ch <= 'Z') && (ch >= 'A');
			  is_num = (ch <= '9') && (ch >= '0');
			  is_dash = (ch == '_');
			  is = (is_al != 0 || is_num != 0 || is_dash != 0);

			  if (is == 0)
			  {
					 //printf("Bug section:%d\nchar:%c\n", i + 1, ch);
					 return 0;
			  }
		}
		return 1;
	}
	public static int Main()
	{
		  int n;
		  int length;
		  int i;
		  char[][] name = new char[100][20];
		  int[] ok = new int[100];

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (i = 0;i <= n - 1;i++)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					name[i] = tempVar2.charAt(0);
				}
				length = String.valueOf(name[i]).length();

				ok[i] = is_legal(name[i], length);
		  }

		  for (i = 0;i <= n - 1;i++)
		  {
		   if (ok[i] != 0)
		   {
			   System.out.print("yes\n");
		   }
		   else
		   {
			   System.out.print("no\n");
		   }
		  }
	}


}

