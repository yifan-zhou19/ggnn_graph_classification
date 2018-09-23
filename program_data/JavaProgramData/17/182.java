import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************
	//*??????.cpp                *
	//*??????                    *
	//*???2011-11-02                *
	//**********************************


	public static int Main()
	{
		String sen = new String(new char[201]); //done[201]????????
		String done = new String(new char[201]);
		int[] pos = new int[200]; //????????????
		int left; //left right???????????
		int right;
		int i; //count ????????????????
		int count;
		int len;
		while (sen = new Scanner(System.in).nextLine())
		{
			  count = 0;
			  left = 0;
			  right = 0;
			  for (i = 0; i < 200; i++)
			  {
				  done = tangible.StringFunctions.changeCharacter(done, i, ' '); //???????? ??
			  }
			  len = sen.length();
			  for (i = 0; i < len; i++)
			  {
				  if (sen.charAt(i) == '(')
				  {
					  pos[count] = i; //????????????????
					  done = tangible.StringFunctions.changeCharacter(done, pos[count], '$'); //??????????????$
					  left++; //??????1
					  count++;
				  }
				  if (sen.charAt(i) == ')')
				  {
					  if (left <= right) //????????????????????
					  {
						  done = tangible.StringFunctions.changeCharacter(done, i, '?');
					  }
					  else
					  {
						   right++;
						   done = tangible.StringFunctions.changeCharacter(done, pos[count - 1], ' '); //???????????????????????????
						   count--;
					  }
				  }
			  }
			  System.out.print(sen);
			  System.out.print("\n");
			  for (i = 0; i < len; i++)
			  {
				  System.out.print(done.charAt(i));
			  }
			  System.out.print("\n");
		}
		return 0;
	}


}

