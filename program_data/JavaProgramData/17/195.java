package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String chuan = new String(new char[101]);
		String shuchu = new String(new char[100]);
		int count1;
		int count2;
		int length;
		int i;
		int j;
		while ((chuan = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
					System.out.print(chuan);
					System.out.print("\n");
					length = chuan.length(); //?????
					shuchu = chuan; //????????????????
					count1 = 0;
					count2 = 0;
					for (i = 0;i < length;i++)
					{
										 if (chuan.charAt(i) == '(')
										 {
											 count1++;
										 }
										 if (chuan.charAt(i) == ')')
										 {
														  count2++;
														  if (count2 > count1)
														  {
																		   shuchu = tangible.StringFunctions.changeCharacter(shuchu, i, '?');
																		   count2--;
														  } //??????????????????????????????
										 }

					} //?????????

					count1 = 0;
					count2 = 0;
					for (i = length - 1;i >= 0;i--)
					{
										 if (chuan.charAt(i) == ')')
										 {
											 count2++;
										 }
										 if (chuan.charAt(i) == '(')
										 {
														  count1++;
														  if (count1 > count2)
														  {
																		   shuchu = tangible.StringFunctions.changeCharacter(shuchu, i, '$');
																		   count1--;
														  } //??????????????????????????????
										 }

					} //?????????
					shuchu = tangible.StringFunctions.changeCharacter(shuchu, length, '\0');
					for (i = 0;i < length;i++)
					{
										 if (shuchu.charAt(i) != '?' && shuchu.charAt(i) != '$')
										 {
											 shuchu = tangible.StringFunctions.changeCharacter(shuchu, i, ' ');
										 }
					} //?????????
					System.out.print(shuchu);
					System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(shuchu,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(chuan,0,(Character.SIZE / Byte.SIZE));
		}
	return 0;
	}
}

