import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String x = new String(new char[81]);
		   int lx;
		   int n;
		   int i;
		   int j;
		   int[] flag = new int[100];
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.in.read();
		   for (i = 1;i <= n;i++)
		   {
				  flag[i] = 1;
				  x = new Scanner(System.in).nextLine();
				  for (lx = 0;x.charAt(lx) != 0;lx++)
				  {
					  ;
				  }
				  if ((x.charAt(0) >= 65 && x.charAt(0) <= 90) || (x.charAt(0) >= 97 && x.charAt(0) <= 122) || x.charAt(0) == '_')
				  {
					 //cout<<1;
					 for (j = 1;j <= lx - 1;j++)
					 {
										 if (((x.charAt(j) < 48) || (x.charAt(j)>57 && x.charAt(j) < 65) || (x.charAt(j)>90 && x.charAt(j) < 97) || (x.charAt(j)>122 && x.charAt(j))) && x.charAt(j) != '_')
										 {
											flag[i] = 0;
											break;
										 }
					 }

				  }
				  else
				  {
					  flag[i] = 0;
				  }

		   }
		   for (i = 1;i <= n;i++)
		   {
							System.out.print(flag[i]);
							System.out.print("\n");
		   }

		   return 0;
	}

}

