import java.util.*;

//****************************************
//*???????                        **
//*????? 1100013004                     **
//*???2010.11.13                          **
//****************************************
int a;
int i;
int j;
int flag = 1;
void recycle(int,char[]);
int main()
{
	int i;
	String str = new String(new char[500]);
	str = new Scanner(System.in).nextLine();
	for (i = 2;str.charAt(i) != '\0';i++)
	{
		  recycle(i,str);
	}

}
void recycle(int a,char str[])
{
			for (i = 0;str[i] != '\0';i++)
			{
				  flag = 1;
				  for (j = 0;j < a;j++)
				  {
						if (str[i + j] != str[i + a - 1 - j])
						{
								 flag = 0;
								 break;
						}
				  }
				  if (flag != 0)
				  {
						  for (j = i ;j < i + a;j++)
						  {
							  System.out.print(str[j]);
						  }
				  }
				  System.out.print("\n");
			}
return;
}
