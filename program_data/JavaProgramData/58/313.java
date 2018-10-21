import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sen = new char[200][90];
		int i;
		int n;
		int p;
		int j;
		int len;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		for (i = 1;i <= n;i++)
		{
			sen[i] = new Scanner(System.in).nextLine();



		}


		  for (i = 1;i <= n;i++)
		  {
			 q = 0;
			 p = 0;
			 len = String.valueOf(sen[i]).length();
			 if (len == 1)
			 {
			   if (sen[i][0] == '_' || (sen[i][0] >= 'a' && sen[i][0] <= 'z') || (sen[i][0] >= 'A' && sen[i][0] <= 'Z'))
			   {
				   System.out.print(1);
				   System.out.print("\n");
				   continue;
			   }

			 }
			else
			{

					for (j = 1;j <= len - 1;j++)
					{

					  if (sen[i][0] == '_' || (sen[i][0] >= 'a' && sen[i][0] <= 'z') || (sen[i][0] >= 'A' && sen[i][0] <= 'Z'))
					  {
						  p = 1;
					  }
					   if ((sen[i][j] >= 'a' && sen[i][0] <= 'z') || (sen[i][j] >= 'A' && sen[i][j] <= 'Z') || (sen[i][j] >= '0' && sen[i][j] <= '9') || (sen[i][j] == '_'))
					   {
						  q = 1;
					   }
					   else
					   {
						  q = 0;
						  break;
					   }

					}


				   if (p == 1 && q == 1)
				   {
					   System.out.print(1);
					   System.out.print("\n");
				   }
				   else
				   {
					System.out.print(0);
					System.out.print("\n");
				   }
			}


		  }

		return 0;

	}























}

