package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String t = new String(new char[500]); //???
		char[][] b = new char[1000][500]; //?????
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int k;
		int r;
		int count = 0;
		int l = a.length();
		for (i = 0;i < l;i++)
		{
						for (k = 1;i + k < l;k++)
						{
										  int h = 1; //????????
										  for (j = 0;j <= k;j++)
										  {
														   if (a.charAt(i + j) != a.charAt(i + k - j))
														   {
																			   h = 0;
																			   break;
														   }
										  } //??????????????????
										  if (h == 1)
										  {
												  for (j = 0;j <= k;j++)
												  {
																   b[count][j] = a.charAt(i + j);
												  }
												  count++;
										  } //???????????b
						}
		}
		for (i = 0;i < count;i++)
		{
							for (j = count - 2;j >= i;j--)
							{
												   if (String.valueOf(b[j]).length() > String.valueOf(b[j + 1]).length())
												   {
													   t = b[j];
													   b[j] = b[j + 1];
													   b[j + 1] = t;
												   } //??????????
							}
		}
		for (r = 0;r < count;r++)
		{
							System.out.print(b[r]);
							System.out.print("\n");
		} //??
		return 0;
	}


}

