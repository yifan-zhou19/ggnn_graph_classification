package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		int jishu;
		int n;
		int len = 0;
		int k = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (n > 0)
		{
			if (k > 0)
			{
				jishu = k + 1;
			}
			else
			{
				jishu = 0;
			}
			k = 0;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);

			n--;
			len = a.length();
			jishu = jishu + len;
			System.out.print(a);

			while (jishu <= 80)
			{

			   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			   n--;

			   len = a.length();
				jishu = jishu + len;

				 if (jishu + 1 <= 80)
				 {
					   System.out.print(" ");
					   System.out.print(a);
					   jishu++;
					   if (n == 0)
					   {
						   break;
					   }

				 }
				   else
				   {
					   k = len;
					   System.out.print("\n");
					   System.out.print(a);
					   System.out.print(" ");
					   break;
				   }
			}
		}







		return 0;
	}










}

