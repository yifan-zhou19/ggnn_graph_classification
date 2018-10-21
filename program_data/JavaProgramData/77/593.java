//****************************************
//*???????                       **
//*????? 1100012873                **
//*???2011.11.16                     **
//****************************************
String t = new String(new char[100]); //??????
int pd = new int(int, int);
int main()
{
	int l;
	t = ConsoleInput.readToWhiteSpace(true).charAt(0);
	l = t.length();
	pd(0, l);
	return 0;
}
int pd(int x, int length)
{
	int i;
	for (i = 1;x + i < length;)
	{
		if (t.charAt(x) == t.charAt(x + i) && t.charAt(x) != 'o') //??????????
		{
			return pd(x + i, length);
		}
		else if (t.charAt(x + i) != t.charAt(x) && t.charAt(x + i) != 'o') //???????????????
		{
			t = tangible.StringFunctions.changeCharacter(t, x, 'o');
			t = tangible.StringFunctions.changeCharacter(t, x + i, 'o');
			System.out.print(x);
			System.out.print(" ");
			System.out.print(x + i);
			System.out.print("\n");
			return pd(x - 1, length);
		}
		else if (t.charAt(x + i) != t.charAt(x) && t.charAt(x + i) == 'o') //????????????
		{
			i++;
		}
		else if (t.charAt(x) == 'o' && t.charAt(x + i) == 'o') //???????
		{
			return pd(x - 1, length);
		}
	}
}




