import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] str_1 = new int[100];
		int[] str_2 = new int[100];
		int[] str_3 = new int[100];
		int n;
		int k;
		String str_a = new String(new char[101]);
		String str_b = new String(new char[101]);
		int len_a;
		int len_b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
		System.in.read();
		str_a = new Scanner(System.in).nextLine();
		str_b = new Scanner(System.in).nextLine();
		len_a = str_a.length();
		len_b = str_b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str_1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str_2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str_3,0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		for (i = len_a - 1;i >= 0;i--)
		{
			str_1[j++] = str_a.charAt(i) - '0';
		}
		j = 0;
		for (i = len_b - 1;i >= 0;i--)
		{
			str_2[j++] = str_b.charAt(i) - '0';
		}
		for (i = 0;i < len_b;i++)
		{
			if (str_1[i] >= str_2[i])
			{
				str_3[i] = str_1[i] - str_2[i];
			}
			else
			{
				str_3[i] = str_1[i] - str_2[i] + 10;
				str_1[i + 1]--;
			}
		}
		for (;i < len_a;i++)
		{
			str_3[i] = str_1[i];
		}
		for (i = 99;i >= 0;i--)
		{
			if (str_3[i] != 0)
			{
				break;
			}
		}
		if (i == -1)
		{
			System.out.print(0);
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(str_3[i]);
			}
		}
		System.out.print("\n");
		}
		return 0;
	}


	/*		
	int main()
	{ 
		const int MAX_LEN = 250;
		unsigned an1[MAX_LEN];
		unsigned an2[MAX_LEN];
		char seLine1[MAX_LEN + 1];
		char seLine2[MAX_LEN + 1];
		cin.getline(seLine1, MAX_LEN + 1);
		cin.getline(seLine2, MAX_LEN + 1);
		int nLen1 = strlen(seLine1);
		int nLen2 = strlen(seLine2);
		memset(an1, 0, sizeof(an1));
		memset(an2, 0,sizeof(an2));
		int i, j=0;
		for (i = nLen1-1;  i>=0; i--)
			an1[j++] = seLine1[i] - '0'; //???????????????
		j=0;
		for (i = nLen2-1; i>=0;i--)
			an2[j++] = seLine2[i] - '0';
		for (i = 0; i < MAX_LEN ;i++)
		{
			an1[i] += an2[i];
			if(an1[i] >= 10) //??????
			{
				an1[i] -=10;
				an1[i + 1]++; // i++?
			}
		}
		i = MAX_LEN - 1;
		for(;i>=0;i--)
			if(an1[i]!=0)
				break; //???????0??
		if(i==-1)
			cout<<0<<endl;
		else
		{
			for(;i >= 0; i--)
				cout << an1[i]; //??????
			cout << endl;
		}
		return 0;
	}*/



}

