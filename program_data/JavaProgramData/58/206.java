import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************
	//*???????*
	//*1000010538    *
	//***************
	public static int Main() //???
	{
		int n; //???????
		int i;
		int k;
		int j;
		int p = 0;
		String str1 = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //?????
		for (i = 0;i < n;i++)
		{
			str1 = new Scanner(System.in).nextLine(); //?????
			k = str1.length(); //????????
			if (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z' || str1.charAt(0) >= 'a' && str1.charAt(0) <= 'z' || str1.charAt(0) == '_') //????????????
			{
				for (j = 1;j < k;j++)
				{
				   if (str1.charAt(j) >= 'A' && str1.charAt(j) <= 'Z' || str1.charAt(j) >= 'a' && str1.charAt(j) <= 'z' || str1.charAt(j) >= '0' && str1.charAt(j) <= '9' || str1.charAt(j) == '_')
				   {
					   ; //??????????????????????
				   }
				   else
				   {
					   break; //??????????
				   }
				}
				  if (j == k)
				  {
					  p = 1; //?????????p??1
				  }


			}
			System.out.print(p);
			System.out.print("\n");
			p = 0; //???p???0????????
		}
			return 0;
	} //?????

}

