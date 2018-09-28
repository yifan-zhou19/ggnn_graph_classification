package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int oushu; //oushu??????i,j,k?????cha??i?????
		int i;
		int count;
		int cha;
		int j;
		int k;
		oushu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= oushu * 0.5;i++) //i?????cha
		{
							cha = oushu - i;
							count = 0;
							for (j = 2;j < i;j++)
							{
											  if (i % j == 0)
											  {
												  count++; //??????????count??
											  }
							}
							for (k = 2;k < cha;k++)
							{
											 if (cha % k == 0)
											 {
												 count++;
											 }
							}
							if (count == 0)
							{
								System.out.print(i);
								System.out.print(" ");
								System.out.print(cha);
								System.out.print("\n");
							}
		}
		return 0;
	}

}

