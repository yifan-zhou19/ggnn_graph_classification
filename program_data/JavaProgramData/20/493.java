package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int i;
		int max_index;
		String str1 = new String(new char[20]);
		String str2 = new String(new char[10]);
		String ans = new String(new char[20]);
		String ipstr1 = str1;
		while (scanf("%s%s",str1,str2) != EOF)
		{
			max = 0;
			for (i = 1; * (str1.Substring(i));i++) /*??????????
			{
				???str1[i]??'\0'????????*/
				if (*(str1.Substring(i)) > max)
				{
					max = (str1.Substring(i)),max_index = i;
				}
			}
			ans = "";
			strncat(ans,str1,max_index + 1); //??(max_index+1)?????
			ans += str2;
			ans += str1.Substring(max_index) + 1;
			/*??(max_index+1)???????????????????????*/
			System.out.printf("%s\n",ans);
		}

	}
}
