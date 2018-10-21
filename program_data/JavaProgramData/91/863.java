import java.util.*;

//********************************
//*???????          **
//*?????? 1200012784 **
//*???2012.12.4         **
//********************************

void change(char *); //??????

int main()
{
	String ch = new String(new char[50]); //?????????
	ch = new Scanner(System.in).nextLine();
	change(ch); //????????
	System.out.print(ch);
	System.out.print("\n");
	return 0;
}

void change(char * ch)
{
	int l = ch.length();
	char key = ch[0];
	for (int i = 0; i < l - 1; i++)
	{
		ch[i] = ch[i] + ch[i + 1];
	}
	ch[l - 1] = ch[l - 1] + key;
}
