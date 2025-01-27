/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ['./src/**/*.{html,js}'],
  theme: {
    extend: {
      colors: {
        primary: {
          1: '#04F2D5',
          2: '#01A7A3',
          3: '#04837B',
          4: '014041'
        }
      }
    }
  },
  daisyui: {
    themes: ['light']
  },
  plugins: [require('daisyui')]
};
