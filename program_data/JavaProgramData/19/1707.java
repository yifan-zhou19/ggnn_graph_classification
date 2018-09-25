package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0; //??????
		int j = 0;
		int k = 0;
		int len;
		String str1 = new String(new char[101]); //???????????????
		String orig = new String(new char[30]);
		String tran = new String(new char[30]);
		char[][] str2 = new char[50][30]; //????????
		cin.get(str1,101,'\n');
		orig = ConsoleInput.readToWhiteSpace(true).charAt(0);
		tran = ConsoleInput.readToWhiteSpace(true).charAt(0);

							while (str1.charAt(i) != '\0') //??\0?
							{
								while (str1.charAt(i) != ' ') //??  ?
								{
								   str2[j][k] = str1.charAt(i);
									   i++;
									   k++; //??
								}
								  str2[j][k] = '\0';
								   j++; //??
								   i++; //??
								   k = 0; //??
							}
					  len = j - 1; //??-1
					  for (i = 0;i <= len;i++)
					  {
						  if (strcmp(str2[i],orig) == 0) //??
						  {
							  str2[i] = tran;
						  }
					  }
							for (i = 0;i <= len - 1;i++)
							{
								System.out.print(str2[i]);
								System.out.print(" ");
							}
							System.out.print(str2[len]);

	return 0;
	}
}

