package <missing>;

public class GlobalMembers
{
	public static char boy;
	public static char girl;
	public static int len = 0;
	/*void take_hand(char a[],int i)
	{
	     if(i==len-1)
	     {
	       cout<<0<<" "<<len-1;
	       return ;
	     }
	     if(a[i]=='o')
	     {
	        take_hand(a,i+1);
	     }
	     if(a[j]==girl)
	     {
	         cout<<i<<" "<<j<<endl;
	         a[i]='o';
	         a[j]='o';
	     }
	     else if(a[j]==boy)
	     {
	          take_hand(a,j);
	     }
	     else
	     j++;
	}*/
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		boy = a[0];
		for (int i = 0;i < 100;i++)
		{
		   if (a[i] != boy)
		   {
			  girl = a[i];
			  break;
		   }
		}
		//take_hand(a,0);
		for (int i = 0;i < len - 1;i++)
		{
				if (a[i] == girl)
				{
					for (int j = i - 1;j > 0;j--)
					{
							if (a[j] == boy)
							{
								System.out.print(j);
								System.out.print(" ");
								System.out.print(i);
								System.out.print("\n");
								a[j] = '\0';
								break;
							}
					}
				}
		}
		System.out.print(0);
		System.out.print(" ");
		System.out.print(len - 1);
		System.out.print("\n");

		return 0;
	}

}

